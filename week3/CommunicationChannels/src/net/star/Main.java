import net.star.MessagingService;
import net.star.channel.Email;
import net.star.channel.TextMessage;

void main() {
    MessagingService service = new MessagingService();

    service.addChannel(new Email("testi@example.com"));
    service.addChannel(new TextMessage("0401234567"));

    service.sendToAll("The exam starts tomorrow");

    service.sendToAll("Remember to submit the assignment about the basics of object-oriented programming. It is a very, very important assignment!!!");

    List<String> emailAddresses =
            List.of("antti-jussi@lakanen.com", "denis@zhidkikh.com");

    List<String> phoneNumbers =
            List.of("0500123123", "0400321321");

    MessagingService service2 = new MessagingService();
    service2.addChannel(new Email(emailAddresses));
    service2.addChannel(new TextMessage(phoneNumbers, 70));

    service2.sendToAll("Remember to complete the feedback survey!");

    service2.sendToAll(
            "The university and university of applied sciences have merged. "
          + "Students are asked to vote on the name of the new institution. "
          + "The options are (a) HigherUniversity, "
          + "(b) VocationalInstitute and "
          + "(c) VocationalHigherInstituteUniversity");

}
