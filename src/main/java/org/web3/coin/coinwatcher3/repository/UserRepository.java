package org.web3.coin.coinwatcher3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web3.coin.coinwatcher3.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
