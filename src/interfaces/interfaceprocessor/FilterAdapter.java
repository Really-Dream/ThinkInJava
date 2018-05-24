package interfaces.interfaceprocessor;

import interfaces.filters.Filter;
import interfaces.filters.Waveform;

/**
 * Created by H.J
 * 2018/5/24
 */
public class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){
        return filter.name();
    }
    public Waveform process(Object input){
        return filter.process((Waveform) input);
    }
}
