package mx.com.citelis.directory.directory;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final DBInfo dbInfo;

    @GetMapping("/dbinfo")
    public DBInfo getDBInfo(){
        return dbInfo;
    }

    @GetMapping("/version")
    public String getAppInfo(@Value("${app.version}") String version){
        return version;
    }
}

@Component
@RequiredArgsConstructor
class DBInfo {
    private final DataSource dataSource;

    public String getUrl() throws SQLException {
        return this.dataSource.getConnection().getMetaData().getURL();
    }
}
