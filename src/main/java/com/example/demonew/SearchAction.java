package com.example.demonew;

import com.intellij.ide.BrowserUtil;
import com.intellij.lang.Language;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class SearchAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        /*Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        CaretModel caretModel = editor.getCaretModel();
        String  selectedText = caretModel.getCurrentCaret().getSelectedText();
        String query = selectedText.replace(' ', '+');*/

        BrowserUtil.browse("https://www.google.com/search?q="  + "Java whats new");
    }


    public void update(@NotNull AnActionEvent e) {
        super.update(e);
        Presentation presentation = e.getPresentation();
        //@Nullable PsiElement psiElement = e.getData(CommonDataKeys.PSI_FILE);
        presentation.setEnabled(true);

    }

}
