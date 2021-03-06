package com.applego.sequent.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PlantUmlFileType extends LanguageFileType {

    public static final PlantUmlFileType INSTANCE = new PlantUmlFileType();

    public static final PlantUmlFileType PLANTUML_FILE_TYPE = new PlantUmlFileType();

    public static final String PLANTUML_EXT = "seq";//""puml";

    public static final Icon PLANTUML_ICON = IconLoader.getIcon("/images/sequent.gif");

    private PlantUmlFileType() {
        super(PlantUmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PlantUML file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "PlantUML diagram files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return PLANTUML_EXT;
    }

    @Override
    public Icon getIcon() {
        return PLANTUML_ICON;
    }

    @Override
    public String getCharset(@NotNull VirtualFile virtualFile, byte[] bytes) {
        return "UTF-8";
    }
}