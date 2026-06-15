interface Printable {
    void print(String message);
}

class Printer implements Printable {
    public void print(String message) {
        System.out.println(message);
    }
}

class Report {
    private final Printable printer;

    public Report(Printable printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}