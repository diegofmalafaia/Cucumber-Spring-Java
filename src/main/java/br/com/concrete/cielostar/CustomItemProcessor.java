package br.com.concrete.cielostar;


import br.com.concrete.cielostar.model.Report;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by gustavooliveira on 28/03/17.
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
    @Override
    public Report process(Report item) throws Exception {
        System.out.println("Processing..." + item);
        return item;
    }
}
