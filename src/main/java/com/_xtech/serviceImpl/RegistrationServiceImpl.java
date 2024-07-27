package com._xtech.serviceImpl;

import com._xtech.model.User;
import com._xtech.repository.UserRepository;
import com._xtech.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
