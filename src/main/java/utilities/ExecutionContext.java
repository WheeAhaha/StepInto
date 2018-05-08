package utilities;

import java.util.HashMap;
import java.util.Map;

public class ExecutionContext {
    private Map<String, String> values = new HashMap();
    private String exPrefix;

    public ExecutionContext(String prefix) {
        this.exPrefix = prefix;
    }

    public void setValue(String key, String value) {
        this.values.put(key, value);
    }

    public String getValue(String key) {
        return (String)this.values.get(key);
    }

    public Map<String, String> getValues() {
        return this.values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public void reset() {
        this.values.clear();
    }

    public boolean isECVar(String context) {
        int preSize = this.exPrefix.length();
        String ecPre = context.substring(0, preSize);
        return this.exPrefix.toUpperCase().equals(ecPre.toUpperCase());
    }

}
