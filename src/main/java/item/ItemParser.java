package item;

public class ItemParser {

    public ItemParser(){
    }

    public String[] splitByLine(String input){
        String[] response = input.split("##");
        return response;
    }

    public String[] splitByKey(String input){
        String[] response = input.split("[;^*@%!]|[##]");
        return response;
    }
}
