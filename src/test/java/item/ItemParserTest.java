package item;

import org.junit.Assert;
import org.junit.Test;

public class ItemParserTest {

    private String sampleData = "naMe:MilK;price:1.23;type:Food!expiration:4/25/2016##" +
            "naMe:apPles;price:0.25;type:Food;expiration:1/23/2016##" +
            "naMe:apPles;price:0.23;type:Food;expiration:5/02/2016##" +
            "NAMe:BrEAD;price:1.23;type:Food;expiration:1/25/2016##" +
            "naMe:;price:3.23;type:Food;expiration:1/04/2016##" +
            "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##" +
            "naME:BreaD;price:1.23;type:Food@expiration:1/02/2016##";

    private String sampleData2 = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##";

    @Test
    public void splitByLineTest(){
        ItemParser itemParser = new ItemParser();
        Integer expected = 7;
        String[] itemStringArray = itemParser.splitByLine(sampleData);
        Integer actual = itemStringArray.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitByKeyTest(){
        ItemParser itemParser = new ItemParser();
        Integer expected = 4;
        String[] keyString = itemParser.splitByKey(sampleData2);
        Integer actual = keyString.length;
        Assert.assertEquals(expected, actual);
    }

}
