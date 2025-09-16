package dev.aga.service

import dev.aga.repo.AddressRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.stereotype.Service

@EnableScheduling
@Service
class AddressService(
  @param:Autowired private val addressRepo: AddressRepo,
){


}
