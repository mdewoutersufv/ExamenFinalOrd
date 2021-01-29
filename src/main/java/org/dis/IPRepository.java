package org.dis;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPRepository extends JpaRepository<IP, Long> {

    //List<IP> findByIp_fromStartsWithIgnoreCase(String ip);

}
