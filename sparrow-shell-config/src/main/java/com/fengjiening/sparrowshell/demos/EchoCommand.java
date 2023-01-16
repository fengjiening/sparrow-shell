package com.fengjiening.sparrowshell.demos;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * <p>
 * 实例
 * @author fengjiening
 * @since 2023-01-16
 */
@ShellComponent
public class EchoCommand {
    @ShellMethod("Echo command")
    public String echo(String str) {
        return str;
    }
}
