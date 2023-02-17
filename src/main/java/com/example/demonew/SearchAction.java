package com.example.demonew;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import org.jetbrains.annotations.NotNull;

public class SearchAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        BrowserUtil.browse("https://www.google.com/search?q=" + "Java whats new");
    }

    public void update(@NotNull AnActionEvent e) {
        super.update(e);
        Presentation presentation = e.getPresentation();
        //@Nullable PsiElement psiElement = e.getData(CommonDataKeys.PSI_FILE);
        presentation.setEnabled(true);

    }

}
