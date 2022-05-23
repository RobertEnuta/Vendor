package robert.vendor.payload.request;
import javax.validation.constraints.NotBlank;
public class LoginRequest {
    @NotBlank
    String username;
    @NotBlank
    String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public Object getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
