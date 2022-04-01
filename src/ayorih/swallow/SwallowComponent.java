package ayorih.swallow;

/**
 * Swallowの機能を利用するすべてのコンポーネントで、SwallowComponentインターフェースを実装する必要があります。
 * このインターフェースを実装したコンポーネントにはテーマを設定することができます
 * @author ayorih
 */
public interface SwallowComponent {

    /**
     * テーマを変更します
     * @param theme 変更するテーマ
     */
    void setTheme(Theme theme);

    /**
     * 現在のテーマを取得します
     * @return 現在のテーマ
     */
    Theme getTheme();

    /**
     * テーマを適応するためのタグを設定します
     * このタグの値に応じて見た目の変更が行われます
     * @param themeTag 設定するタグ
     */
    void setThemeTag(String themeTag);

    /**
     * テーマを適応するためのタグを取得します
     * @return 現在のタグ
     */
    String getThemeTag();

    /**
     * テーマを適応させます
     */
    void adaptTheme();

}
