package mvc.dataAccessLayer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {
		
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1 and password=?2",nativeQuery = true)
	public int checkUidPwdInDB(String uid,String pwd);
		
}

