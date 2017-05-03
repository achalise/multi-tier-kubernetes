import { FrontEndPage } from './app.po';

describe('front-end App', () => {
  let page: FrontEndPage;

  beforeEach(() => {
    page = new FrontEndPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
