package dev.aga.repo

import dev.aga.entity.Address
import dev.aga.entity._Address
import dev.aga.entity.address
import org.komapper.core.dsl.Meta
import org.komapper.jdbc.JdbcDatabase
import org.springframework.stereotype.Repository

@Repository
class AddressRepo(override val db: JdbcDatabase): CrudRepo<Address, Int, _Address> {
  override val table = Meta.address
  override val idProperty = Meta.address.id
}
