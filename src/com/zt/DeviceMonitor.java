package com.zt;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.util.EnvironmentUtil;

public class DeviceMonitor extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        String osName = System.getProperty("os.name");
        String monitorPath = EnvironmentUtil.getValue("ANDROID_HOME");

        if (osName.toLowerCase().startsWith("win")) {
            monitorPath  += "\\tools\\monitor.bat";
        } else {
            monitorPath += "/tools/monitor";
        }

        try {
            Runtime.getRuntime().exec(monitorPath);
        } catch (Exception exception) {

        }
    }


}
