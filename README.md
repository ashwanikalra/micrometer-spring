# micrometer-spring
### Micrometer Spring Boot and Prometheus integration sample
- Uses Counted and Timed annotation from Micrometer to capture the Metrics on a method and publish to Prometheus.
- The client in this project calls the server running in other project. Download from here https://github.com/ashwanikalra/cxf-server
- Run the CXF server from the above repo. 
- Run the application and call the endpoint http://localhost:8080/call-service
- Prometheus' data is available at http://localhost:8080/actuator/prometheus

Configuration to be added to Prometheus YAML configuration file

<pre>
scrape_configs:
  - job_name: 'spring-actuator'
    metrics_path: '/actuator/prometheus' # Job to scrape application metrics
    scrape_interval: 5s
    static_configs:
      - targets: ['localhost:8080']
</pre>