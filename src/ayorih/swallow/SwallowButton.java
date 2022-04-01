package ayorih.swallow;

import javax.swing.*;

public class SwallowButton extends JButton implements SwallowComponent {

    private Theme theme;
    private String themeTag;

    /**
     * テーマを変更します
     *
     * @param theme 変更するテーマ
     */
    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    /**
     * 現在のテーマを取得します
     *
     * @return 現在のテーマ
     */
    @Override
    public Theme getTheme() {
        return theme;
    }

    /**
     * テーマを適応するためのタグを設定します
     * このタグの値に応じて見た目の変更が行われます
     *
     * @param themeTag 設定するタグ
     */
    @Override
    public void setThemeTag(String themeTag) {
        this.themeTag = themeTag;
    }

    /**
     * テーマを定期王するためのタグを取得します
     *
     * @return 現在のタグ
     */
    @Override
    public String getThemeTag() {
        return themeTag;
    }

    /**
     * テーマを適応させます
     */
    @Override
    public void adaptTheme() {
        if(theme == null){
            return;
        }
        Theme.ComponentAppearance appearance = theme.getComponentAppearance(themeTag);
        this.setBackground(appearance.getBackgroundColor());
        this.setForeground(appearance.getDefaultTextColor());
        this.setBorder(appearance.getBorder());
    }
}
