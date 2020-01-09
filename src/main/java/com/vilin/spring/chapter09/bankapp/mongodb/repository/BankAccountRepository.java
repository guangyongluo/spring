package com.vilin.spring.chapter09.bankapp.mongodb.repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.vilin.spring.chapter09.bankapp.mongodb.domain.BankAccountDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.scheduling.annotation.Async;

public interface BankAccountRepository
		extends MongoRepository<BankAccountDetails, String>, BankAccountRepositoryCustom {

	long countByBalance(int balance);

	BankAccountDetails findByAccountId(String id);

	List<BankAccountDetails> removeByBalance(int balance);

	List<BankAccountDetails> findByBalance(int balance);

	List<BankAccountDetails> findByFixedDepositsTenureLessThan(int tenure);

	List<BankAccountDetails> findByFixedDepositsFdAmountGreaterThan(int fdAmount);

	List<BankAccountDetails> findTop2ByOrderByFixedDepositsFdCreationDateDesc();

	List<BankAccountDetails> findTop2ByFixedDepositsTenure(int tenure);

	List<BankAccountDetails> findByFixedDepositsTenureAndFixedDepositsFdAmount(int tenure, int fdAmount);

	@Async
	CompletableFuture<List<BankAccountDetails>> findAllByBalanceGreaterThan(int balance);

	@Query("{ 'tenure' : ?0, 'fdAmount' : {'$lte' : ?1}, 'active' : ?2}")
	List<BankAccountDetails> findByCustomQuery(int tenure, int fdAmount, String active);
}
