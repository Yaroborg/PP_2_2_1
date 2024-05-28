package hiber.service;

import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    @Transactional(readOnly = true)
    User getUserByCarModelAndSeries(String model, int series);

    void add(User user);
    List<User> listUsers();
    User getUserByCar(String model, int series);
}
