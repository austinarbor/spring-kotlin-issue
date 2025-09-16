package dev.aga.repo

import org.komapper.core.dsl.metamodel.EntityMetamodel
import org.komapper.core.dsl.metamodel.PropertyMetamodel
import org.komapper.jdbc.JdbcDatabase

interface CrudRepo<E : Any, ID : Any, M : EntityMetamodel<E, ID, M>> {
  val table: M
  val db: JdbcDatabase
  val idProperty: PropertyMetamodel<E, ID, ID>

  fun save(e: E): E {
    return e
  }

  fun delete(id: ID): Long {
    return 0L
  }
}
