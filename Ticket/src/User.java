import java.util.List;

public class User {
    private long id;
    private String name;
    private List<Ticket> tickets;
    private String login;
    private long passwordHashCode;
    private long accountId;

    public User(long id, String name, List<Ticket> tickets, String login, long passwordHashCode, long accountId) {
        this.id = id;
        this.name = name;
        this.tickets = tickets;
        this.login = login;
        this.passwordHashCode = passwordHashCode;
        this.accountId = accountId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getPasswordHashCode() {
        return passwordHashCode;
    }

    public void setPasswordHashCode(long passwordHashCode) {
        this.passwordHashCode = passwordHashCode;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
