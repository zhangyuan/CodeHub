public class HubService {
    private HubDao hubDao;

    public void setHubDao(HubDao hubDao) {
        this.hubDao = hubDao;
    }

    public HubEntity find(int id) {
        return hubDao.find(id);
    }
}
