
@RestController
@RequestMapping("/users")
public class ApiController {
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return new User(userId, "John Doe", "john.doe@example.com");
    }
}
