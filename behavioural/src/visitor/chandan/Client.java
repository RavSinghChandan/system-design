package visitor.chandan;

public class Client {
    public static void main(String[] args) {
        // Creating different consultation types
        Consultation palmReading = new PalmReading();
        Consultation vastuConsultation = new VastuConsultation();

        // Creating visitors (operations to perform)
        ConsultationVisitor bookAppointment = new AppointmentBookingVisitor();
        ConsultationVisitor giveFeedback = new FeedbackVisitor();

        // Visiting each consultation type with different operations
        System.out.println("---- Booking Appointments ----");
        palmReading.accept(bookAppointment);
        vastuConsultation.accept(bookAppointment);

        System.out.println("\n---- Providing Feedback ----");
        palmReading.accept(giveFeedback);
        vastuConsultation.accept(giveFeedback);
    }
}
