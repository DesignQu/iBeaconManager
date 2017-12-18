package com.tool.bluetooth.detector.core;

import android.content.Context;

import com.tool.bluetooth.detector.BluetoothDetectorCallBack;
import com.tool.bluetooth.detector.BluetoothDetectorHandler;
import com.tool.bluetooth.detector.config.BluetoothFilter;

public interface BluetoothScannerHandler {

    /**
     * 开启扫描
     */
    void startScan(BluetoothDetectorCallBack callBack);

    /**
     * 开启扫描
     */
    void startScan(BluetoothFilter filter, BluetoothDetectorCallBack callBack);

    /**
     * 关闭扫描
     */
    void stopScan(BluetoothDetectorCallBack callBack);

    void requestCheckEach(Context context, BluetoothDetectorHandler.CheckResponse response);
}