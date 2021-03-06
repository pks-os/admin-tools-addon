package com.haulmont.addon.admintools.core.tomcat;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;

import java.io.IOException;

@ManagedResource(description = "Operations on Tomcat running the core block")
public interface TomcatCoreMBean {

    @ManagedOperation(description = "Execute script by path in Tomcat directory")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "path", description = "Relative script path from Tomcat dir"),
            @ManagedOperationParameter(name = "arguments", description = "Arguments for a script")
    })
    void executeScript(String relativePath, String arguments) throws IOException;

    @ManagedOperation(description = "Reboot Tomcat in the core module")
    void reboot() throws IOException, InterruptedException;

    @ManagedOperation(description = "Shutdown Tomcat in the core module")
    void shutdown() throws IOException, InterruptedException;

    @ManagedOperation(description = "Return an absolute path to the Tomcat directory")
    String getTomcatAbsolutePath();
}
