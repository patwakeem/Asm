# Java Library for Accessing the Apica Synthetic Monitoring API

Using this library requires an ASM auth ticket. You can find this by logging in to your ASM account and browsing here:
https://wpm.apicasystem.com/Tools/ApiSettings

Feature list:

 * Create/Read/Delete Checks
 * Get Check Results
 * Create/Ready/Update/Delete Check Groups
 * Kick off check runs

Samples
* Create an ASM client object. This is the first step for all API operations.

```java
class Example {
    
//  Environment variables: 
//  ASM_API_KEY
//  ASM_API_SILO
    public void connectWithEnvironmentVariables() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
    }
    
    public void connectWithHardCodedVariables() {
        
        AsmAuthentication a = new AsmCredentialsAuthentication("auth-ticket", Silo.ONE);
        AsmApiClient asmApiClient = new AsmApiClient(a);
    }
}

```

* List check groups and view subgroups

```java
class Example {
    public void listTopLevelGroups() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        Optional<List<AsmTopLevelGroup>> groupOptional = asmApiClient.getGroups();
        
        List<AsmTopLevelGroup> groups = groupOptional.get();
        
        AsmTopLevelGroup topLevelGroup = groups.get(0);
        
//      List subgroups:
        List<AsmSubGroup> subGroupList = topLevelGroup.getGroups();
    }
}

```

* Create Top Level Check Group

```java
class Example {
    public void createGroup() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        AddGroupBody addTopLevelGroupBody = new AddGroupBody();
        addTopLevelGroupBody.setName("New Top Group");
        addTopLevelGroupBody.setTopGroupId(null);
        
        asmApiClient.createGroup(addTopLevelGroupBody);
    }
    
}

```


* Create Subgroup

```java
class Example {
    public void createSubGroup() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int groupId = 12345;
        
        AddGroupBody addSubGroupBody = new AddGroupBody();
        addTopLevelGroupBody.setName("New Sub Group");
        addTopLevelGroupBody.setTopGroupId(13223);
        
        asmApiClient.createGroup(addSubGroupBody);
    }
   
}

```

* Delete Check Group

```java
class Example {
    public void deleteGroups() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int groupId = 12345;
        
//      By Id        
        asmApiClient.deleteGroup(groupId);
        
//      With group object
        asmApiClient.deleteGroup(groupObject);
        
    }
    
}

```

* List Locations by CheckType

```java
class Example {
    public void listLocations() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        Optional<List<AsmLocation>> browserLocations = asmApiClient.getLocationsByCheckType(CheckType.BROWSER);
        Optional<List<AsmLocation>> pingLocations = asmApiClient.getLocationsByCheckType(CheckType.PING);
        Optional<List<AsmLocation>> portLocations = asmApiClient.getLocationsByCheckType(CheckType.PORT);
        Optional<List<AsmLocation>> urlLocations = asmApiClient.getLocationsByCheckType(CheckType.URL);
    }
}

```

* List Checks

```java
class Example {
    public void listChecks() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        Optional<List<AsmCheck>> allChecks = asmApiClient.getAllChecks();
    }
}

```

* Create Check

```java
class Example {
    public void connectWithEnvironmentVariables() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        List<Integer> groupIds = new ArrayList<>();
        integers.add(23425);
        
        CreateCheckBody createCheckBody = new CreateBrowserCheckBody();
        createCheckBody.setLocationCode(asmLocation.getLocationCode());
        createCheckBody.setIntervalSeconds(600);
        createCheckBody.setMaxAttempts(5);
        createCheckBody.setName("test test test");
        createCheckBody.setTarget("www.google.com");
        createCheckBody.setMonitorGroupsIds(groupIds);
        
        CreateCheckRequest createCheckRequest = new CreateCheckRequest(CheckType.BROWSER, createCheckBody);
        asmApiClient.createCheck(createCheckRequest);
    }
}

```

* Run Check

```java
class Example {
    public void connectWithEnvironmentVariables() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int checkId = 12345;
        
//      By Id        
        asmApiClient.runCheck(checkId);
        
//      With Object        
        asmApiClient.runCheck(asmCheckObject);
        
    }
}

```

* Delete Check

```java
class Example {
   
    public void connectWithEnvironmentVariables() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int checkId = 12345;
        
//      By Id        
        asmApiClient.deleteCheck(checkId);
        
//      With Object        
        asmApiClient.deleteCheck(asmCheckObject);
    }
    
}

```

* Get Check History

```java
class Example {
    public void getCheckHistory() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int checkId = 12345;
        
        String fromUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis() - 36000);
        String toUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis());
        
        GetCheckHistoryRequest getCheckHistoryRequest = new GetCheckHistoryRequest(fromUtc, toUtc, checkId);
        Optional<List<AsmCheckDetailHistory>> checkHistory = asmApiClient.getCheckHistory(getCheckHistoryRequest);
    }
}

```

* Get URL Data for Check Result

```java
class Example {
    public void getDetailedUrlResultsFromResultId() {
        AsmAuthentication a = new AsmEnvironmentAuthentication();
        AsmApiClient asmApiClient = new AsmApiClient(a);
        
        int checkId = 12345;
        
        GetFprResultByIdBody getFprResultByIdBody = new GetFprResultByIdBody();
        getFprResultByIdBody.setResultIds(listOfResultIds);
        
        Optional<FprUrlResults> fprUrlDetailsByResultId = asmApiClient.getFprUrlDetailsByResultId(checkId, getFprResultByIdBody);
    }
}

```

### Libraries used:

 * [Retrofit](https://square.github.io/retrofit/) Awesome REST client.
 * [Gson](https://github.com/google/gson) Mapping JSON to objects.

