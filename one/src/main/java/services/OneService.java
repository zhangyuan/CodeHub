package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneService {
    @Autowired
    private OneDao oneDao;

    public int apply() {
        return oneDao.apply(1);
    }

    public int apply(int id) {
        return oneDao.apply(id);
    }
}
