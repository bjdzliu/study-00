

vault policy write plumber-service plumber-service.hcl
vault token create -policy=plumber-service

vault policy write provisioner provisioner.hcl
vault token create -policy=provisioner
