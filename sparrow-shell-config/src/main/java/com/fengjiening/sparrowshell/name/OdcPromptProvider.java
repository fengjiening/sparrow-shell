package com.fengjiening.sparrowshell.name;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;
/**
 * <p>
 * sehll 名字
 *
 * @author fengjiening
 * @since 2023-01-16
 */
@Component
public class OdcPromptProvider implements PromptProvider {
    @Value("${sparrow.shell.dispaly.name}")
    private String dispalyName;
    @Override
    public AttributedString getPrompt() {
        // 定制命令提示符为红色的
        return new AttributedString(dispalyName+":>",AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }
}
