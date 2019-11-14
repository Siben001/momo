package momo.DAO;


//@Transactional
//@Repository
public class WordDAO {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public void save(Word word) {
//        entityManager.persist(word);
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
//            // save the student object
//            session.save(word);
//            // commit transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    public List getAll() {
//        String hql = "FROM Word";
//        Session session = this.sessionFactory.getCurrentSession();
//        Query<Word> query = session.createQuery(hql, Word.class);
//        return query.getResultList();
////        return entityManager.createQuery(hql).getResultList();
////        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
////            return session.createQuery("from Word", Word.class).list();
////
////        }
//    }
}
