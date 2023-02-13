import org.example.CommonCharacters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharactersTest {
    @Test
    public void commonCharactersTest() {
        var testMap1 = CommonCharacters.commonCharacters(new String[]{"qwe", "ewq", "a", "a"});
        Map<String, List<Integer>> expectedMap = new HashMap<>();
        expectedMap.put("a", List.of(2, 3));
        expectedMap.put("qwe", List.of(0, 1));
        Assertions.assertEquals(testMap1, expectedMap);

        var testMap2 = CommonCharacters.commonCharacters(new String[]{"qwe", "eww", "a"});
        Map<String, List<Integer>> expectedMap2 = new HashMap<>();
        Assertions.assertEquals(testMap2, expectedMap2);

        var testMap3 = CommonCharacters.commonCharacters(new String[]{"a", "eww", "wwe", "a"});
        Map<String, List<Integer>> expectedMap3 = new HashMap<>();
        expectedMap3.put("a", List.of(0, 3));
        expectedMap3.put("eww", List.of(1, 2));
        Assertions.assertEquals(testMap3, expectedMap3);

        var testMap4 = CommonCharacters.commonCharacters(new String[]{"a", "", "", "a"});
        Map<String, List<Integer>> expectedMap4 = new HashMap<>();
        expectedMap4.put("a", List.of(0, 3));
        Assertions.assertEquals(testMap4, expectedMap4);

        var testMap5 = CommonCharacters.commonCharacters(new String[]{});
        Map<String, List<Integer>> expectedMap5 = new HashMap<>();
        Assertions.assertEquals(testMap5, expectedMap5);

        var testMap6 = CommonCharacters.commonCharacters(new String[]{"www"});
        Map<String, List<Integer>> expectedMap6 = new HashMap<>();
        Assertions.assertEquals(testMap6, expectedMap6);

        var testMap7 = CommonCharacters.commonCharacters(new String[]{"AAw", "aaw"});
        Map<String, List<Integer>> expectedMap7 = new HashMap<>();
        Assertions.assertEquals(testMap7, expectedMap7);

        var testMap8 = CommonCharacters.commonCharacters(new String[]{"AAw", "aaw", "aaw"});
        Map<String, List<Integer>> expectedMap8 = new HashMap<>();
        expectedMap8.put("aaw", List.of(1, 2));
        Assertions.assertEquals(testMap8, expectedMap8);
    }
}
