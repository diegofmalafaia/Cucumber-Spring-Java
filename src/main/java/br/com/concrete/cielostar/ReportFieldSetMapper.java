package br.com.concrete.cielostar;


import br.com.concrete.cielostar.model.Report;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import static br.com.concrete.cielostar.util.DateUtil.convertStringToDate;

/**
 * Created by gustavooliveira on 28/03/17.
 */
public class ReportFieldSetMapper implements FieldSetMapper<Report> {

    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report report = new Report();
        report.setId(fieldSet.readInt(0));
        report.setSales(fieldSet.readBigDecimal(1));
        report.setQty(fieldSet.readInt(2));
        report.setStaffName(fieldSet.readString(3));

        String date = fieldSet.readString(4);
        report.setDate(convertStringToDate(date));

        return report;
    }


}
