package com.closset.study.flyway.domain

import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, Long>
