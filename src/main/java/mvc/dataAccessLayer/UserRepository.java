package mvc.dataAccessLayer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {
	//checking uid pwd for login service	
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1 and password=?2",nativeQuery = true)
	public int checkUidPwdInDB(String uid,String pwd);
	
	//checking uid for delete service
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1",nativeQuery = true)
	public int checkUidInDB(String uid);
	
	
	//update for reset password service
	/*@Transactional
	@Modifying
	@Query("UPDATE UsersEntity u SET u.password=?2 WHERE u.userid= ?1")
	public int updatePwd(String uid,String pwd);
	
	//update for profile update service
	@Transactional
	@Modifying
	@Query("UPDATE UsersEntity u SET u.firstname= ?2 and u.lastname= ?3 WHERE u.userid= ?1")
	public int updateProfile(String uid,String pwd,String fname,String lname);*/
	
}

