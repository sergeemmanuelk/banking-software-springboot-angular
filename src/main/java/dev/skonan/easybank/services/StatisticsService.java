package dev.skonan.easybank.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

public interface StatisticsService {
    Map<LocalDate, BigDecimal> findSumTransactionsByDate(LocalDate startDate, LocalDate endDate, Integer userId);

    BigDecimal getAccountBalancer(Integer userId);

    BigDecimal highestTransfer(Integer userId);

    BigDecimal highestDeposit(Integer userId);
}
