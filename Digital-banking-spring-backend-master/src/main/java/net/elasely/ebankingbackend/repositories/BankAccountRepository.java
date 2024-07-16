package net.elasely.ebankingbackend.repositories;

import net.elasely.ebankingbackend.entities.BankAccount;
import net.elasely.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
