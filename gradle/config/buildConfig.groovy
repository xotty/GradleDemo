environments {
    local {
        server {
            hostname = 'localhost'
            sshPort = 2222
            username = 'vagrant'
        }

        tomcat {
            hostname = '193.168.1.33'
            port = 8080
            context = 'todo'
        }
    }
}

outer {
    outerName ="outer"
    msg = "this is a outer message."

    inner {
        innerName= "inner"
        msg = "This is a inner message."
    }

}