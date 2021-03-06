package sk.chgolian.simple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SimpleRepository extends JpaRepository<SimpleEntity, Long> {

    @Query(name = SimpleEntity.SIMPLE_QUERY)
    Set<ShortInfo> retrieveShortInfos();
}
