package se.umu.cs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QueryStringBuilder {

    public static final String BRACE_LEFT = "{";
    public static final String BRACE_RIGHT = "}";
    public static final String PARENTHESIS_LEFT = "(";
    public static final String PARENTHESIS_RIGHT = ")";
    public static final String COMMA = ",";
    public static final String COLON = ":";
    public static final String SPACE = " ";

    private StringBuilder stringBuilder;

    private QueryStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private QueryStringBuilder(String string) {
        stringBuilder = new StringBuilder(string);
    }

    public static QueryStringBuilder getInstance() {
        return new QueryStringBuilder();
    }

    public static QueryStringBuilder getInstance(String string) {
        return new QueryStringBuilder(string);
    }

    public QueryStringBuilder append(String string) {
        stringBuilder.append(string);
        return this;
    }

    public QueryStringBuilder appendSpaceAndBraceLeft() {
        stringBuilder.append(SPACE).append(BRACE_LEFT);
        return this;
    }

    public QueryStringBuilder appendParenthesisLeft() {
        stringBuilder.append(PARENTHESIS_LEFT);
        return this;
    }

    public QueryStringBuilder appendParenthesisRight() {
        stringBuilder.append(PARENTHESIS_RIGHT);
        return this;
    }

    public QueryStringBuilder appendKeyValuePair(String key, String value) {
        stringBuilder.append(key).append(COLON).append(SPACE).append(value);
        return this;
    }

    public QueryStringBuilder appendArgumentsSeparator() {
        stringBuilder.append(COMMA).append(SPACE);
        return this;
    }

    public QueryStringBuilder appendArguments(HashMap<String, String> arguments) {

        if(!arguments.isEmpty()) {

            stringBuilder.append(PARENTHESIS_LEFT);

            Iterator<Map.Entry<String, String>> iterator = arguments.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();

                stringBuilder.append(entry.getKey()).append(COLON).append(SPACE).append(entry.getValue());

                if (iterator.hasNext()) {
                    stringBuilder.append(COMMA).append(SPACE);
                }
            }

            stringBuilder.append(PARENTHESIS_RIGHT);
        }

        return this;
    }

    // @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public static String objectCreator(String objectName, HashMap<String, String> arguments, String body) {

        StringBuilder stringBuilder = new StringBuilder(objectName);

        if(arguments.size() > 0) {

            stringBuilder.append("(");

            Iterator<Map.Entry<String, String>> iterator = arguments.entrySet().iterator();

            while(iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();

                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());

                if(iterator.hasNext()) {
                    stringBuilder.append(", ");
                }
            }

            stringBuilder.append(")");
        }

        stringBuilder.append(" { ");
        stringBuilder.append(body);
        stringBuilder.append(" }");

        return stringBuilder.toString();
    }
}
