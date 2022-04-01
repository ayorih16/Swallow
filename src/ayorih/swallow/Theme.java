package ayorih.swallow;

import javax.swing.border.Border;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * このクラスは、Swallowで構築されるGUI全体の外観の情報を保持します。
 * @author ayorih
 */
public class Theme {

    private final Map<String, ComponentAppearance> componentAppearanceMap;

    /**
     * 新しいテーマを作成します
     * @param componentAppearanceMap テーマタグとComponentAppearanceのマップ
     */
    public Theme(Map<String, ComponentAppearance> componentAppearanceMap) {
        this.componentAppearanceMap = componentAppearanceMap;
    }

    /**
     * 新しいテーマを作成します
     */
    public Theme(){
        this(new HashMap<>());
    }

    /**
     * テーマタグとComponentAppearanceのマップオブジェクトを返します
     * 注意 :このメソッドで取得したマップオブジェクトを変更してもテーマのデータは変更されません
     * @return テーマタグとComponentAppearanceのマップオブジェクト
     */
    public Map<String, ComponentAppearance> getComponentAppearanceMap() {
        return new HashMap<>(componentAppearanceMap);
    }

    /**
     * 指定されたテーマタグのComponentAppearanceを返します
     * 存在しない場合はnullを返します
     * @param themeTag テーマタグ
     * @return 対応するComponentAppearanceオブジェクト
     */
    public ComponentAppearance getComponentAppearance(String themeTag){
        if(!componentAppearanceMap.containsKey(themeTag)){//テーマタグが設定されていなかったら
            return null;
        }
        return componentAppearanceMap.get(themeTag);
    }

    /**
     * ComponentAppearanceオブジェクトを追加します
     * @param themeTag テーマタグ
     * @param appearance ComponentAppearanceオブジェクト
     */
    public void addComponentAppearance(String themeTag, ComponentAppearance appearance){
        componentAppearanceMap.put(themeTag, appearance);
    }

    /**
     * 各コンポーネントの外観の情報を保持します
     */
    public static class ComponentAppearance{
        private final Color backgroundColor;
        private final Color defaultTextColor;
        private final Color highlightTextColor;
        private final Border border;

        /**
         * 新しいComponentAppearanceオブジェクトを生成します
         * @param backgroundColor 背景色
         * @param defaultTextColor 標準の文字色
         * @param highlightTextColor 強調の文字色
         * @param border ボーダーオブジェクト
         */
        public ComponentAppearance(Color backgroundColor, Color defaultTextColor, Color highlightTextColor, Border border) {
            this.backgroundColor = backgroundColor;
            this.defaultTextColor = defaultTextColor;
            this.highlightTextColor = highlightTextColor;
            this.border = border;
        }

        /**
         * コンポーネントの背景色を取得します
         * @return コンポーネントの背景色
         */
        public Color getBackgroundColor() {
            return backgroundColor;
        }

        /**
         * 通常の文字色を取得します
         * @return コンポーネントの背景色
         */
        public Color getDefaultTextColor() {
            return defaultTextColor;
        }

        /**
         * 文字の強調色を取得します
         * @return 文字の強調色
         */
        public Color getHighlightTextColor() {
            return highlightTextColor;
        }

        /**
         * ボーダーを取得します
         * @return ボーダーオブジェクト
         */
        public Border getBorder() {
            return border;
        }

    }

}
