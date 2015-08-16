package com.zhaijiong.stock;

import com.zhaijiong.stock.common.Utils;
import com.zhaijiong.stock.model.StockData;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void testGetTomorrow() throws Exception {
        System.out.println(Utils.getTomorrow());
    }

    @Test
    public void testGetYesterday() throws Exception {
        System.out.println(Utils.getYesterday());
    }

    @Test
    public void testGetRowkeyWithMD5Prefix(){
        StockData stock = new StockData();
        stock.symbol ="002444";
        byte[] rowkey = Utils.getRowkeyWithMD5Prefix(stock);
        System.out.println(Bytes.toString(rowkey));
    }
}