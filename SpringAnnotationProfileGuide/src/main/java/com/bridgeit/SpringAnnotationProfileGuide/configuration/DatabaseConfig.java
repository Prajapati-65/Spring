package com.bridgeit.SpringAnnotationProfileGuide.configuration;

import javax.sql.DataSource;

public interface DatabaseConfig {

	DataSource createDataSource();
}
