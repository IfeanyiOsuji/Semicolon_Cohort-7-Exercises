package africa.semicolon;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class PrintingToScanner {
    public static void main(String[] args) {

    }
    public static PrintService findPrintService(String printerName){
        PrintService service = null;
        PrintService[] services = PrinterJob.lookupPrintServices();
        for(int index =0; service ==null && index < services.length; index++){
            if(services[index].getName().equalsIgnoreCase(printerName)){
                service = services[index];
            }
        }
        return service;
    }
    public static PrinterJob findPrinterJob(String printerName) throws PrinterException {
        PrintService printService = findPrintService(printerName);
        if(printService == null){
            throw new IllegalStateException("Unrecognized printer service \""+ printerName +'"');
        }
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        //set the print service
        printerJob.setPrintService(printService);
        return printerJob;
    }
    public static void refreshSystemPrinterList(){
        Class [] classes = PrintServiceLookup.class.getDeclaredClasses();
        for(int i=0; i<classes.length; i++){
            if("javax.print.PrintserviceLookup$Services".equals(classes[i].getName())){
                sun.awt.AppContext.getAppContext().remove(classes[i].getName());
                break;
            }
        }
    }
}
