package se.umu.cs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QueryBuilder {

    public static final String BRACE_LEFT = "{";
    public static final String BRACE_RIGHT = "}";
    public static final String COLON = ":";
    public static final String COMMA = ",";
    public static final String PARENTHESIS_LEFT = "(";
    public static final String PARENTHESIS_RIGHT = ")";
    public static final String SPACE = " ";

    private StringBuilder stringBuilder;

    private QueryBuilder() {
        stringBuilder = new StringBuilder();
    }

    public static QueryBuilder getInstance(String name) {
        return (new QueryBuilder()).appendSelectionSet(name);
    }

    public static QueryBuilder getInstance(String name, HashMap<String, String> arguments) {
        return (new QueryBuilder()).appendSelectionSet(name, arguments);
    }

    public QueryBuilder appendSelectionSet(String name) {
        stringBuilder.append(name).append(SPACE).append(BRACE_LEFT).append(SPACE);
        return this;
    }

    public QueryBuilder appendSelectionSet(String name, HashMap<String, String> arguments) {
        stringBuilder.append(name);
        appendArguments(arguments);
        stringBuilder.append(SPACE).append(BRACE_LEFT).append(SPACE);
        return this;
    }

    public QueryBuilder appendField(String name) {
        stringBuilder.append(name).append(SPACE);
        return this;
    }

    public QueryBuilder appendBuiltSelectionSet(String selectionSet) {
        stringBuilder.append(selectionSet).append(SPACE);
        return this;
    }

    public QueryBuilder appendClosingBrace() {
        stringBuilder.append(BRACE_RIGHT).append(SPACE);
        return this;
    }

    public QueryBuilder appendClosingBraces() {

        String tempString = stringBuilder.toString();
        int unclosedBracesCount = occurrencesCount(tempString, BRACE_LEFT) - occurrencesCount(tempString, BRACE_RIGHT);

        for(int i = 0; i < unclosedBracesCount; i++) {

            stringBuilder.append(BRACE_RIGHT);

            if(i != (unclosedBracesCount - 1)) {
                stringBuilder.append(SPACE);
            }
        }

        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    private QueryBuilder appendArguments(HashMap<String, String> arguments) {

        if(!arguments.isEmpty()) {
            Map.Entry<String, String> argument;

            stringBuilder.append(PARENTHESIS_LEFT);

            Iterator<Map.Entry<String, String>> iterator = arguments.entrySet().iterator();

            while(iterator.hasNext()) {
                argument = iterator.next();

                stringBuilder.append(argument.getKey()).append(COLON).append(SPACE).append(argument.getValue());

                if(iterator.hasNext()) {
                    stringBuilder.append(COMMA).append(SPACE);
                }
            }

            stringBuilder.append(PARENTHESIS_RIGHT);
        }

        return this;
    }

    private int occurrencesCount(String string, String token) {
        return string.length() - string.replace(token, "").length();
    }
}
