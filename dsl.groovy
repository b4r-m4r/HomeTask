pipelineJob('flask-web-app') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/b4r-m4r/flask-image')
          }
          branch('*/main')
        }
      }
      lightweight()
    }
  }
}
pipelineJob('nginx-proxy') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/b4r-m4r/nginx-proxy.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}

pipelineJob('reverseproxy-test') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/b4r-m4r/build-test')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}