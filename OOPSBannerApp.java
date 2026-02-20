// Author: Suhas T G
// Version: 7.0

public class OOPSBannerApp {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    // Builds the map of characters to their 7-line ASCII art patterns.
    public static CharacterPatternMap[] buildCharacterPatternMaps() {
        CharacterPatternMap[] mapArray = new CharacterPatternMap[3];

        String[] oGlyph = new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };

        String[] pGlyph = new String[] {
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       "
        };

        String[] sGlyph = new String[] {
            "   ***** ",
            " **      ",
            "**       ",
            "  ****   ",
            "     **  ",
            "**    ** ",
            "  ****   "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', oGlyph),
            new CharacterPatternMap('P', pGlyph),
            new CharacterPatternMap('S', sGlyph),
        };
    }

    // Fetches the pattern for the requested character; returns blanks if not found.
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] mapArr) {
        for (CharacterPatternMap entry : mapArr) {
            if (ch == entry.character) return entry.pattern;
        }
        return new String[] { " ", " ", " ", " ", " ", " ", " " };
    }

    // Prints the full banner message by stitching each row of every character.
    public static void printMessage(String text, CharacterPatternMap[] mapArr) {
        for (int row = 0; row < 7; row++) {
            for (char ch : text.toCharArray()) {
                String[] glyph = getCharacterPattern(ch, mapArr);
                System.out.print(glyph[row] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        CharacterPatternMap[] mapArr = buildCharacterPatternMaps();
        String text = "OOPS";
        printMessage(text, mapArr);
    }
}